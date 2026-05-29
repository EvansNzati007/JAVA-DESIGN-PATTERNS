//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

//      FichierMac fichierMac = new FichierMac();
//      FichierLinux fichierLinux = new FichierLinux();
//      FichierWinwdows fichierWinwdows = new FichierWinwdows();
//
//      fichierWinwdows.Parse("C:\\WINDOWS\\hello.dll");
//      fichierLinux.Parse("/user/share/hello.dll");

    ReaderFile reader = new ReaderFile();

    reader.setStrategy(new WindoswStrategy());
    reader.parse("C:\\WINDOWS\\hello.dll");

    reader.setStrategy(new LinuxStrategy());

    reader.parse("/user/share/hello.rc");
    }
    }