abstract class Printer{
    private String model;
    private int printedCount, availableCount;
    Printer(String model, int availableCount){
        this.model = model;
        this.availableCount = availableCount;
    }

    abstract public boolean print();
    public String getModel(){ return model; }
    public int getPrintedCount(){ return printedCount; }
    public int getAvailableCount(){ return availableCount; }

    public void addAvailableCount(int num){ availableCount += num; }
    public void addPrintedCount(int num){ printedCount += num; }
}

class InkjetPrinter extends Printer{
    InkjetPrinter(String model, int availableCount){
        super(model, availableCount);
    }

    public boolean print(){
        if(getAvailableCount() == 0){
            System.out.printf("%s: %d매째 인쇄 실패 - 잉크 부족.\n", getModel(), getPrintedCount() + 1);
            return false;
        }

        addPrintedCount(1);
        addAvailableCount(-1);
        return true;
    }
}

class LaserPrinter extends Printer{
    LaserPrinter(String model, int availableCount){
        super(model, availableCount);
    }

    public boolean print(){
        if(getAvailableCount() == 0){
            System.out.printf("%s: %d매째 인쇄 실패 - 토너 부족.\n", getModel(), getPrintedCount() + 1);
            return false;
        }

        addPrintedCount(1);
        addAvailableCount(-1);
        return true;
    }
}

public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while(inkjet.print());
        while(laser.print());
    }
}
