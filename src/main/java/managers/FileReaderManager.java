package managers;

public class FileReaderManager {
    private static FileReaderManager fileReaderManager = new FileReaderManager();
    private static ConfigFileReader confiFileReader;

    private FileReaderManager(){

    }

    private static FileReaderManager getInstance(){
        return fileReaderManager;
    }

    public ConfigFileReader getConfigReader(){
        return (confiFileReader == null) ? new ConfigFileReader() : confiFileReader;
    }
}
