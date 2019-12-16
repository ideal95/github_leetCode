package dataStructures;

/**
 * 链表
 *
 * @author : lixiang
 * @date : 2019-12-13 16:07
 */
public class SingleLinkedList {
    public static void main(String[] args) {

    }
}

//定义singleLinkedList 管理
class SingleLinkedListDemo {
    //定义一个头节点
    private HeroNode head = new HeroNode(0, "", "");

    public void add(HeroNode heroNode) {
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
    }
}

//定义heroNode 每一个heroNode 对象就是一个节点
class HeroNode {
    public int no;
    public String name;
    public String nickName;
    public HeroNode next;

    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
