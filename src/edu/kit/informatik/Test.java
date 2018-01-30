package edu.kit.informatik;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.Date;

public class Test {

    static void func(Object r) {
        
        Date dt = new Date();
        dt.getTime();
        try {
            File dat = new File("dat.file");
            InputStream is = new BufferedInputStream(new FileInputStream(dat));
            is.read();
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
            
    }
    
}
