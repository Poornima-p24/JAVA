package BusReservationSystem.src;
public class Bus
{
int busno;
boolean ac;
int capacity;
Bus(int no,boolean ac,int cap)
{
    this.busno=no;
    this.ac=ac;
    this.capacity=cap;
}
public boolean isAc()
{
    return ac;
}
public int getCapacity(){
    return capacity;
}
public void setAc(boolean val)
{
    ac=val;
}
public void setCapacity(int cap)
{
    capacity=cap;
}
public void display()
{}
}
