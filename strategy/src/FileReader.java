interface  Parse{
    void Parse(String path);

}

class  FichierWinwdows implements Parse{
    @Override
    public void Parse(String path) {

        int index = path.lastIndexOf("\\")  ;
        String fichier = path.substring(index+1);

        System.out.println(fichier);
    }
}

class   FichierLinux implements Parse{
    @Override
    public void Parse(String path) {
        int index = path.lastIndexOf("/")  ;

        String fichier = path.substring(index+1);
        System.out.println(fichier);
    }
}
class  FichierMac implements Parse{
    @Override
    public void Parse(String path) {

    }
}




