package binoryTree;

public class BinaryTree {
	int[] binarytree = new int[256];
	private int maxTiefe = 0;

	public void add(int value) {
		this.add(value, 0, 1);
	}

	public void add(int value, int pos, int tiefe) {
		if (pos < this.binarytree.length) {
			if (binarytree[pos] == 0) {
				// Tiefe bekannt
				if (tiefe > maxTiefe) {
					maxTiefe = tiefe;
				}
				binarytree[pos] = value;
			} else {
				if (binarytree[pos] > value) {
					// linke Seite
					add(value, 2 * pos + 1, tiefe + 1);
				} else {
					// rechte Seite
					add(value, 2 * pos + 2, tiefe + 1);
				}
			}
		}
	}

	public void print() {
		System.out.println("Tiefe: " + maxTiefe);
		System.out.print("[");
		for (int i = 0; i < this.binarytree.length; i++) {
			System.out.print(this.binarytree[i]);
			if (i < this.binarytree.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.add(12);
		bt.add(8);
		bt.add(14);
		bt.add(22);
		bt.add(1);
		bt.add(87);
		bt.add(69);
		bt.add(92);
		bt.print();
	}
}
