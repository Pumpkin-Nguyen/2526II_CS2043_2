public class Main {
    public static void main(String[] args) {

        Folder root = new Folder("root");
        Folder docs = new Folder("docs");

        FileItem a = new FileItem("a.txt", 12);
        FileItem b = new FileItem("b.txt", 8);
        
        Shortcut aShortcut = new Shortcut("a-shortcut", a);
        
        FileItem readme = new FileItem("readme.md", 4);

        docs.addItem(a);
        docs.addItem(b);
        docs.addItem(aShortcut);

        root.addItem(docs);
        root.addItem(readme);

        root.print("");
    }
}
