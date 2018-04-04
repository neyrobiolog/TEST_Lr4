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
    
    /**
     * Получить коэффициент конвертирования единицы измерения по его индексу
     * @param index наименование единицы измерения, тип int
     * @return коэффициент конвертирования, тип double
     */
    public static double getCoefficient(int index) {
       return 0.01; 
    }
    
}
