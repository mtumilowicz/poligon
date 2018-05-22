package problems.trees.binary;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by mtumilowicz on 2018-05-22.
 */
public class BinaryTree {
    private final String data;
    private final BinaryTree left;
    private final BinaryTree right;

    public BinaryTree(String data, BinaryTree left, BinaryTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public List<String> toList() {
        return toList(new LinkedList<>(Collections.singletonList(this)), 
                new LinkedList<>(Collections.singletonList(this)));
    }

    public String data() {
        return data;
    }
    private List<String> toList(List<BinaryTree> toReturn, List<BinaryTree> offset) {
        if (offset.size() == 0) return toReturn.stream().map(BinaryTree::data).collect(Collectors.toList());
        LinkedList<BinaryTree> temp = new LinkedList<>();
        offset.stream().forEach(bt -> {
            Optional.ofNullable(bt.left).ifPresent(temp::add);
            Optional.ofNullable(bt.right).ifPresent(temp::add);
        });
        toReturn.addAll(temp);
        return toList(toReturn, temp);
    }
}
