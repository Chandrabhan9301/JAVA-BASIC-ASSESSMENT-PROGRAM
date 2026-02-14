package Assignment8;

class MarkSheetA{
    Integer physicsMask, mathermaticsMask, chemistryMask, englishMask, hindiMask, maximumMask;

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

    public void findMaximumMask(){

        maximumMask = physicsMask;

        if(mathermaticsMask>=maximumMask){
            maximumMask = mathermaticsMask;
        }
        if(chemistryMask>=maximumMask){
            maximumMask = chemistryMask;
        }
        if(englishMask>=maximumMask){
            maximumMask = englishMask;
        }
        if(hindiMask>=maximumMask){
            maximumMask= hindiMask;
        }

        System.out.println("Maximum Mask = "+maximumMask);
    }
}

public class FindMasimunMasks {

    public static void main(String[] args) {
        MarkSheetA obj = new MarkSheetA();

        obj.setPhysicsMask(70);
        obj.setMathermaticsMask(78);
        obj.setChemistryMask(60);
        obj.setEnglishMask(70);
        obj.setHindiMask(70);


        obj.getPhysicsMask();
        obj.getMathermaticsMask();
        obj.getChemistryMask();
        obj.getEnglishMask();
        obj.getHindiMask();

        obj.findMaximumMask();
    }
    
}