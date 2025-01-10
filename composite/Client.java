public class Client {
    public static void main(String[] args) {
        // Create files
        File file1 = new File("File1.txt", 100);
        File file2 = new File("File2.jpg", 200);
        File file3 = new File("File3.pdf", 300);

        // Create folders
        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");

        // Add files to folders
        folder1.add(file1);
        folder1.add(file2);

        folder2.add(file3);

        // Create a root folder and add subfolders/files
        Folder rootFolder = new Folder("RootFolder");
        rootFolder.add(folder1);
        rootFolder.add(folder2);

        // Display the file system
        rootFolder.display("");

        // Display total size of the root folder
        System.out.println("\nTotal size of RootFolder: " + rootFolder.getSize() + " KB");
    }
}
