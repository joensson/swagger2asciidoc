package io.swagger2asciidoc;

import org.junit.Test;

import java.io.File;

/**
 * Project:   swagger2AsciiDoc
 * Copyright: Deutsche Telekom AG
 *
 * @author Robert Winkler <robert.winkler@telekom.de>
 * @since 2.0.0
 */
public class Swagger2AsciiDocConverterTest {

    @Test
    public void testSwagger2AsciiDocConverter(){
        File file = new File(Swagger2AsciiDocConverterTest.class.getResource("/json/swagger.json").getFile());
        Swagger2AsciiDocConverter.newInstance(
                file.getAbsolutePath(),
                "C:\\Users\\robert.winkler\\Documents\\git\\swagger2asciidoc\\src\\docs\\asciidoc\\swagger.adoc")
                .convertSwagger2AsciiDoc();
    }
}