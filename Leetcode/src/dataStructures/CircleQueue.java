package dataStructures;

/**
 * @author : lixiang
 * @date : 2019-12-13 15:31
 */
public class CircleQueue {


}

//使用数组模拟环形队列
class CircleArrayQueue {
    //    最大容量
    private int maxSize;
    //  队列头
    private int front;
    //    队列尾
    private int rear;
    //     用于存放数据，模拟队列
    private int[] arr;

    public CircleArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
        this.front = 0;//指向队列头前一个位置
        this.rear = 0;//指向队列尾
    }

    //    判断队列是否满
    public boolean isFull() {

        return (rear + 1) % maxSize == front;

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
        arr[rear] = n;
//        让rear后移
        rear = (rear + 1) % maxSize;
    }

    //    获取队列数据
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，不能取数据");
        }
//        这里需要分析
//        1、先把front对应的值保存
//        2、将front后移
//        3、将临时保存的变量返回
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
    }

    //显示队列所有数据
    public void show() {
        if (isEmpty()) {
            System.out.println("队列为空，不能取数据");
            return;
        }
//        从front开始遍历，遍历多少个元素
        for (int i = front; i < front + size(); i++) {
            System.out.println(arr[i % maxSize]);
        }
    }

    //   求当前队列有效数据
    public int size() {
        return (rear + maxSize - front) % maxSize;
    }

    //    显示队列头部
    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，不能取数据");
        }
        return arr[front];
    }

}
