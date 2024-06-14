package ZOOstructure02;

public class zoo2{

    public static class Animal{
        protected String Type,Origin;
        protected float Age,Height,Weight;

        public Animal(){
            Type="Invalid";
            Origin="Invalid";
            Age=000;
            Height=000;
            Weight=000;
        }

        public void setType(String type){this.Type=type;}
        public void setOrigin(String origin){this.Origin=origin;}
        public void setAge(float age){this.Age=age;}
        public void setHeight(float height){this.Height=height;}
        public void setWeight(float weight){this.Weight=weight;}

        public String getType(){
            String type="Domestic";
            if(this.Type=="W" || this.Type=="w"){type="Wild";}
            return type;
        }
        public String getOrigin(){return this.Origin;}
        public float getAge(){return this.Age;}
        public float getHeight(){return this.Height;}
        public float getWeight(){return this.Weight;}
    }

    public static class Tiger extends Animal{
        protected String TNameID,FurColor;

        public Tiger(){
            TNameID="0000";
            FurColor="Invalid";
        }

        public void setTNameID(String tid){this.TNameID=tid;}
        public void setFurColor(String furColor){this.FurColor=furColor;}

        public String getTNameID(){return this.TNameID;}
        public String getFurColor(){return this.FurColor;}        
    }

    public static class Elephant extends Animal{
        protected String EnameID,SkinColor;

        public Elephant(){
            EnameID="Invalid";
            SkinColor="Invalid";
        }

        public void setENameID(String eid){this.EnameID=eid;}
        public void setSkinColor(String skinColor){this.SkinColor=skinColor;}

        public String getENameID(){return this.EnameID;}
        public String getSkinColor(){return this.SkinColor;}
    }

    public static void main(String[] args) {
        
    }
}


