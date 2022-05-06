class Data {
int i;
boolean valueset = false;
synchronized void produce(int i) {
if (valueset) {
try {
wait();	
} catch (Exception e) {
System.out.println(e);
}
this.i = i;
valueset = true;
System.out.println("Data production done :" + i);
notify();
}
}
synchronized int consume() {
if (!valueset) {
try {
wait();
} catch (Exception e) {
System.out.println(e);
System.out.println("Data Consumption done :" + i);
valueset = false;
notify();
return i;
}
}
return i;
}
}
class Producer extends Thread {
Data d;
public void Producer() {
this.d = d;	
}
@Override
public void run() {
for (int j = 1; j <=5 ; j++) {
d.produce(j);
}
}
}
class Consumer extends Thread {
Data d;
public Consumer() {
this.d = d;
}
@Override
public void run() {
for (int k = 1; k <=5 ; k++) {
d.produce(k);
}	
}
}
class ThreadCommExample {
public static void main(String[] args) {
Data d = new Data();
Producer p = new Producer();
Consumer c = new Consumer();
p.start();
c.start();
}
}