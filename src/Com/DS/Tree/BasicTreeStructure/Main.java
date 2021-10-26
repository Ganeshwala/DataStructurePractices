package Com.DS.Tree.BasicTreeStructure;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode drink = new TreeNode("Drinks");
		TreeNode hot = new TreeNode("Hot");
		TreeNode cold = new TreeNode("cold");
		TreeNode tea = new TreeNode("tea");
		TreeNode coffee = new TreeNode("coffee");
		drink.addChildren(hot);
		drink.addChildren(cold);
		hot.addChildren(tea);
		hot.addChildren(coffee);
		System.out.println(drink.printTree(0));
	}

}
