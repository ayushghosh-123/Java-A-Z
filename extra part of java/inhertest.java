class room
{
    int length;
    int breadth;
room(int x, int y)
    {
        length = x;
        breadth = y;
    }
int area()
    {
        return (length*breadth);
    }
}

class bedroom extends room{
    int height;
    bedroom(int x,int y,int z)
    {
        super(x , y);
        height = z;
    }
    int volume()
    {
        return(length*height*breadth);
    }
}

public class inhertest
{
    public static void main(String[] args){
        bedroom room1 = new bedroom(14, 12, 10);
        int areal = room1.area();
        int volume1 = room1.volume();
        System.err.println("areal = "+ areal);
        System.err.println("volume = "+ volume1);
    }
}