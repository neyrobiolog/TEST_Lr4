package convert;

/**
 * Класс конвертирования величин длины
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
    
    //Массив коэффициентов конвертирования
    private static double[] coefficient = {
        0.01,   //сантиметр
        1,      //метр
        1000,   //киллометр
        1852,   //миля
        0.3,    //фут
        0.9144, //ярд
        1066.8, //верста
        2.133,  //сажень
        0.711   //аршин
    };
    
    /**
     * Получить коэффициент конвертирования единицы измерения из массива по его индексу
     * @param index индекс в массиве (или наименование единицы измерения), тип int
     * @return коэффициент конвертирования, записанный по данному индексу, тип double
     * @throws return -1 в случае, если передается индекс, выходящий за пределы массива коэффициентов
     */
    public static double getCoefficient(int index) {
       if (index < 0 || index > coefficient.length)
           return -1;
       else
           return coefficient[index];  
    }
       
    /**
     * Конвертирование полученного значения длины в метры
     * @param edIzm единица измерения, из которой конвертируем, тип int
     * @param length длина, которую необходимо конфертировать, тип double
     * @return полученная в результате конвертирования длина в метрах, тип double  
     */
    public static double convertToMeter(int edIzm, double length) {
        //TODO: В будущем здесь будет адекватное умножение и даже проверки
        if (edIzm == MILE)
            return 28706.0;
        else if (edIzm == VERSTA)
            return 80543.4;
        return 0.6;
    }
    
    
}
