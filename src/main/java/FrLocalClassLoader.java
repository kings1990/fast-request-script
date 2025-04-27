
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FrLocalClassLoader extends ClassLoader {
    private final String classpath;

    /**
     * @param classpath 类路径,例如/Users/username/xx_project/target/classes
     */
    public FrLocalClassLoader(String classpath) {
        this.classpath = classpath;
    }

    @Override
    public Class<?> findClass(String name) throws ClassNotFoundException {
        String filePath = classpath + File.separator + name.replace(".", File.separator) + ".class";
        File file = new File(filePath);
        if (!file.exists()) {
            throw new ClassNotFoundException("Class not found: " + name);
        }
        try (InputStream inputStream = new FileInputStream(file)) {
            byte[] classData = new byte[(int) file.length()];
            inputStream.read(classData);
            return defineClass(name, classData, 0, classData.length);
        } catch (IOException e) {
            throw new ClassNotFoundException("Could not load class: " + name, e);
        }
    }
}