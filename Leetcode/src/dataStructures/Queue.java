package dataStructures;

/**
 * @author : lixiang
 * @date : 2019-12-13 11:52
 */
public class Queue {

    public static void main(String[] args) {

    }
}

//使用数组模拟队列-编写一个ArrayQueue
class ArrayQueue {
    //    最大容量
    private int maxSize;
    //  队列头
    private int front;
    //    队列尾
    private int rear;
    //     用于存放数据，模拟队列
    private int[] arr;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
        this.front = -1;//指向队列头前一个位置
        this.rear = -1;//指向队列尾
    }

    //    判断队列是否满
    public boolean isFull() {

        return rear == maxSize - 1;

    }

    //  判断是否为空
    public boolean isEmpty() {
        return rear == front;
    }

    //添加数据到队列
    public void addQueue(int n) {
        if (isFull()) {
            System.out.println("队列满，不能加入数据");
            return;
        }
//        让rear后移
        rear++;
        arr[rear] = n;
    }

    //    获取队列数据
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，不能取数据");
        }
        front++;
        return arr[front];
    }

    //显示队列所有数据
    public void show() {
        if (isEmpty()) {
            System.out.println("队列为空，不能取数据");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //    显示队列头部
    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，不能取数据");
        }
        return arr[front + 1];
    }
}
