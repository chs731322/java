package e03_syncronized;

import java.util.ArrayList;

public class SyncroMain {

	public static void main(String[] args) {
		ArrayList<Player> list = new ArrayList<Player>();
		for (int i = 0; i < 5; i++)
			list.add(new Player());
		list.forEach(t -> t.start());
	}

}