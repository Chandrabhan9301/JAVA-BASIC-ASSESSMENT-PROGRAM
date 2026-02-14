package Assignment8;

class MarkSheetC{
    Integer physicsMask, mathermaticsMask, chemistryMask, englishMask, hindiMask, passintMask;

    public void setPhysicsMask(Integer physicsNo){
        physicsMask = physicsNo;
    }
    public void getPhysicsMask(){
        System.out.println("Physics Mask = "+physicsMask);
    }


    public void setMathermaticsMask(Integer mathermaticsNo){
        mathermaticsMask = mathermaticsNo;
    }
    public void getMathermaticsMask(){
        System.out.println("Mathermatics Mask = "+mathermaticsMask);
    }


    public void setChemistryMask(Integer chemistryNo){
        chemistryMask = chemistryNo;
    }
    public void getChemistryMask(){
        System.out.println("Chemistry Mask = "+chemistryMask);
    }



    public void setEnglishMask(Integer englishNo){
        englishMask = englishNo;
    }
    public void getEnglishMask(){
        System.out.println("English Mask = "+englishMask);
    }


    public void setHindiMask(Integer hindiNo){
        hindiMask = hindiNo;
    }
     public void getHindiMask(){
        System.out.println("Hindi Mask = "+hindiMask);
    }

    public void passOrFail(){
        
        if(physicsMask>=33 && mathermaticsMask>=33 && chemistryMask>=33 && englishMask>=33 && hindiMask>=33){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }

}

public class FindResult {
     public static void main(String[] args) {
        MarkSheetC obj = new MarkSheetC();

        obj.setPhysicsMask(70);
        obj.setMathermaticsMask(78);
        obj.setChemistryMask(60);
        obj.setEnglishMask(90);
        obj.setHindiMask(70);


        obj.getPhysicsMask();
        obj.getMathermaticsMask();
        obj.getChemistryMask();
        obj.getEnglishMask();
        obj.getHindiMask();

        obj.passOrFail();
    }
}
