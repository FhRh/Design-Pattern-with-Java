package forest;

import javax.swing.*;
import java.util.ArrayList;

public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    //실질적으로 Flyweight(TreeFactory)를 사용하는 코드
    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData); //공통 속성을 TreeFactory에서 가져와서
        Tree tree = new Tree(x, y, type);   //객체를 생성한다. 타입은 하나의 객체를 공유하는 것으로 사용
        trees.add(tree);
    }

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

}
