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
    
    //Американская система
    public static final int KVITAL = 3;     //Квитал
    
    /**
     * Получить коэффициент конвертирования единицы измерения из массива по его индексу
     * @param index наименование единицы измерения, тип int
     * @return коэффициент конвертирования
     */
    public static double getCoefficient(int index) {
        if (index == KVITAL) 
                return 43.36;
        return 0.001; 
    }
}