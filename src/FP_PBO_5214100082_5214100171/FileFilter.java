package FP_PBO_5214100082_5214100171;
import java.io.File;

/**
 *
 * @author user Fandhi Akhmad dan Rheindra Alfarizi
 */
public class FileFilter extends javax.swing.filechooser.FileFilter {
        @Override
        public boolean accept(File file) {
            
            return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
        }
        @Override
        public String getDescription() {
            return "Text documents (*.txt)";
        }
} 