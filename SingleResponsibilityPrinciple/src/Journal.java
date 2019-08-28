import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal {

	private final List<String> entries = new ArrayList<String>();

	private static int count = 0;

	public void addEntry(String text) {
		entries.add("" + (++count) + ": " + text);
	}

	public void removeEntry(int index) {
		entries.remove(index);
	}

	@Override
	public String toString() {
		return String.join(System.lineSeparator(), entries);
	}

	public void save(String fileName) throws FileNotFoundException {
		try (PrintStream out = new PrintStream(fileName)) {
			out.println(toString());
		}
	}

	public void load(String fileName) {
	}

	public void load(URL url) {
	}
}

class Persistence {
	public void saveToFile(Journal journal, String fileName, boolean overwrite) throws Exception {
		if (overwrite || new File(fileName).exists())
			try (PrintStream out = new PrintStream(fileName)) {
				out.println(journal.toString());
			}
	}

	public void load(Journal journal, String fileName) {

	}

	public void load(Journal journal, URL url) {

	}
}

class Demo {
	public static void main(String[] args) throws Exception {

		Journal j = new Journal();
		j.addEntry("I drank Bacardi");
		j.addEntry("I ate a bug");
		System.out.println(j);

		Persistence p = new Persistence();
		String fileName = "c:\\temp\\journal.txt";
		p.saveToFile(j, fileName, true);

		// Windows
		Runtime.getRuntime().exec("notepad.exe " + fileName);

	}
}
