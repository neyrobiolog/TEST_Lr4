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
     * Конвертирование полученного значения длины в метры по формуле: 
     * длина * коэффициент перевода в метры для полученной единицы измерения
     * @param edIzm единица измерения, из которой конвертируем, тип int
     * @param length длина, которую необходимо конфертировать, тип double
     * @return полученная в результате конвертирования длина в метрах, тип double
     * @throws return -1 в случае, если передается непредусмотренная единица измерения  
     */
    public static double convertToMeter(int edIzm, double length) {
        if (edIzm < 0 || edIzm > 9)
            return -1;
        else
            return length * coefficient[edIzm];
    }
        
    /**
     * Конвертирование длины из одной единицы измерения в другую
     * @param length длина, которую необходимо конфертировать, тип double
     * @param edIzmFrom единица измерения, из которой конвертируем, тип int
     * @param systemTo единица измерения, в которую конвертируем, тип int
     * @return полученная в результате конвертирования длины в нужной системе, тип double
     */
    public static double converting(int edIzmFrom, double length, int edIzmTo) {
        //TODO: Заменить в дальнейшем на расчет по формуле
        return 0.01593;
    }
}
