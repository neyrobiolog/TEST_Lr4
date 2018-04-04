package convert;

/**
 *
 * Класс конвертирования величин веса
 * @author neyrobiolog
 */
public class ConWeight {
        
    //Конструктор класса
    public ConWeight() {};
    
    //Переменные для обращения к коэффициентам единиц измерения для конвертирования
    //Система СИ
    public static final int GRAMM = 0;      //Грамм
    public static final int KILOGRAMM = 1;  //Килограмм
    public static final int TONNA = 2;      //Тонна
    
    //Американская система
    public static final int KVITAL = 3;     //Квитал
    public static final int KVARTER = 4;    //Квартер
    public static final int STOUN = 5;      //Стоун
    
    //Старорусская система
    public static final int LOT = 6;        //Лот
    public static final int ZOLOTNIK = 7;   //Золотник
    public static final int DOLY = 8;       //Доля
    
    /**
     * Получить коэффициент конвертирования единицы измерения из массива по его индексу
     * @param index наименование единицы измерения, тип int
     * @return коэффициент конвертирования
     */
    public static double getCoefficient(int index) {
        //TODO: сделать адекватно, а не с кучей if-ов
        //TODO: да сделайте вы уже switch
        if (index == KVITAL) 
                return 43.36;
        else if (index == LOT) 
                return 0.01638;
        else if (index == KILOGRAMM) 
                return 1;
        else if (index == TONNA) 
                return 1000;
        else if (index == KVARTER) 
                return 6.35;
        else if (index == STOUN) 
                return 0.01638;
        else if (index == ZOLOTNIK) 
                return 0.00426;
        else if (index == DOLY) 
                return 0.00004;
        return 0.001; 
    }
}