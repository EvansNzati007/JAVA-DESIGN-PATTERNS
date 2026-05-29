public class WindoswStrategy implements FileStrategy {
    @Override
    public void Parse(String path) {
        int index = path.lastIndexOf("\\")  ;
        String fichier = path.substring(index+1);

        System.out.println(fichier);
    }
}
