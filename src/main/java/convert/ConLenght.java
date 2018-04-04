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
    
    //Американская система
    public static final int MILE = 3;       //Миля
    
    //Старорусская система
    public static final int VERSTA = 6;     //Верста
    
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
       return 0.01; 
    }
    
}
