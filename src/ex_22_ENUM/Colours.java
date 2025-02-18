package ex_22_ENUM;

enum Colors{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

   private String hexcode;

   Colors(String code){
       this.hexcode=code;

    }
    String getCode()
    {
        return this.hexcode;
    }
}
