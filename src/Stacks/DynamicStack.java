package Stacks;

public class DynamicStack extends CustomStack{

    public DynamicStack() {// this will call the CustomStack()
        super();
    }

    public DynamicStack(int size) {// this will call the CustomStack(int size)
        super(size);
    }

    @Override
    public boolean push(int item) {
        if (isFull()){
            //double the size of array
            int[] temp = new int[data.length * 2];

            //copy all previous items in new array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        //at this point we know that array is not full
        //insert item regular wat
        return super.push(item);
    }
}
