package convert;

/**
 * Класс конвертирования величин длины.
 * @author neyrobiolog
 */
public class ConLenght {
    
    //Конструктор класса
    public ConLenght() {};
        
    //Переменные для обращения к коэффициентам единиц измерения для конвертирования
    //Система СИ
    public static final int CANTIMETER = 0; //Сантиметр
    public static final int METER = 1;      //Метр
    public static final int KILOMETER = 2;  //Километр
    
    //Американская система
    public static final int MILE = 3;       //Миля
    public static final int FUT = 4;        //Фут
    public static final int YARD = 5;       //Ярд
    
    //Старорусская система
    public static final int VERSTA = 6;     //Верста
    public static final int SAZHEN = 7;     //Сажень
    public static final int ARSHIN = 8;     //Аршин
    
    /**
     * Получить коэффициент конвертирования единицы измерения по его индексу
     * @param index наименование единицы измерения, тип int
     * @return коэффициент конвертирования, тип double
     */
    public static double getCoefficient(int index) {
       //TODO: В лучшее время здесь сделать нормальный возврат коэффициентов 
       if (index == MILE)
           return 1852;
       else if (index == VERSTA)
           return 1066.8;
       else if (index == METER)
           return 1;
       else if (index == KILOMETER)
           return 1000;
       else if (index == FUT)
           return 0.3;
       else if (index == YARD)
           return 0.9144;
       else if (index == SAZHEN)
           return 2.133;
       else if (index == ARSHIN)
           return 0.711;
       return 0.01; 
    }
    
}
