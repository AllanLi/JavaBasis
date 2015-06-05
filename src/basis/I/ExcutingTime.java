package basis.I;
/*
 * 將要做的事情寫在 doSomething() & doAnotherthing() 之中
 *  可以計算花費的時間
 */
class ExcutingTime{
    public static void main(String[] args) {
        long time1, time2, time3;
        time1 = System.currentTimeMillis();
        // doSomething()
        time2 = System.currentTimeMillis();
        // doAnotherthing()
        time3 = System.currentTimeMillis();        
        System.out.println("doSomething()花了：" + (time2-time1)/1000 + "秒");        
        System.out.println("doAnotherthing()花了：" + (time3-time2)/1000 + "秒");
    }
}

