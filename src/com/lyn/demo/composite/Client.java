package com.lyn.demo.composite;

public class Client {
	/**
	 *  适用性
		以下情况下适用Composite模式：
		1)．你想表示对象的部分-整体层次结构
		2)．你希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象。
	 * 
	 * 构建模式的组成
         1)．  抽象构件角色（component）：是组合中的对象声明接口，在适当的情况下，实现所有类共有接口的默认行为。声明一个接口用于访问和管理Component子部件。
          	这个接口可  以用来管理所有的子对象。(可选)在递归结构中定义一个接口，用于访问一个父部件，并在合适的情况下实现它。  
         2)． 树叶构件角色(Leaf)：在组合树中表示叶节点对象，叶节点没有子节点。并在组合中定义图元对象的行为。
         3)．树枝构件角色（Composite）：定义有子部件的那些部件的行为。存储子部件。在Component接口中实现与子部件有关的操作。
         4)．客户角色（Client）：通过component接口操纵组合部件的对象。   
	 *
	 */
	public static void main(String[] args) {
		MenuComponent headMenu = new MenuComposite("head", "");
		MenuComponent secondheadMenu = new MenuComposite("secondheadMenu", "");
		MenuComponent thirdheadMenu = new MenuComposite("thirdheadMenu", "");
		MenuComponent leaf = new ItemLeaf("leaf1", "www.baidu.com");
		MenuComponent leaf2 = new ItemLeaf("leaf2", "www.douyu.com");
		MenuComponent secondLeaf = new ItemLeaf("secondLeaf1", "www.nexor.com"); 
		MenuComponent secondLeaf2 = new ItemLeaf("secondLeaf2", "www.google.com"); 
		MenuComponent secondheadMenuSub = new MenuComposite("secondheadMenuSub", "");
		MenuComponent secondsubLeaf = new ItemLeaf("secondsubLeaf1", "www.nexor.com1"); 
		MenuComponent secondsubLeaf2 = new ItemLeaf("secondsubLeaf2", "www.google.com2"); 
		MenuComponent thirdLeaf = new ItemLeaf("thirdLeaf", "www.nexor.com"); 
		headMenu.add(secondheadMenu);
		headMenu.add(thirdheadMenu);
		headMenu.add(leaf);
		headMenu.add(leaf2);
		secondheadMenu.add(secondLeaf);
		secondheadMenu.add(secondLeaf2);
		secondheadMenu.add(secondheadMenuSub);
		secondheadMenuSub.add(secondsubLeaf);
		secondheadMenuSub.add(secondsubLeaf2);
		thirdheadMenu.add(thirdLeaf);
		headMenu.displayOperation(0);
	}

}
