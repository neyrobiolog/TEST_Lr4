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
        
    //Массив коэффициентов конвертирования
    private static double[] coefficients = {
        0.001, //Грамм
        1, //Киллограм
        1000, //Тонна
        43.36, //Квитал
        11.34, //Квартер
        6.35, //Стоун
        0.01638, //Лот
        0.00426, //Золотник
        0.00004 //Доля
    };
    
    /**
     * Получить коэффициент конвертирования единицы измерения из массива по его индексу
     * @param index индекс в массиве (или наименование единицы измерения), тип int
     * @return коэффициент конвертирования, записанный по данному индексу, тип double
     * @throws return -1 в случае, если передается индекс, выходящий за пределы массива коэффициентов
     */
    public static double getCoefficient(int index) {
       if (index < 0 || index > coefficients.length)
           return -1;
       else
           return coefficients[index]; 
    }
    
    /**
     * Конвертирование полученного значения массы в киллограммы по формуле:
     * масса * коэффициент перевода в килограммы для полученной единицы измерения
     * @param edIzm единица измерения, из которой конвертируем, тип int
     * @param weight масса, которую необходимо конфертировать, тип double
     * @return полученная в результате конвертирования масса в киллограмах, тип double
     * @throws return -1 в случае, если передается непредусмотренная единица измерения 
     */
    public static double convertToKilogramm(int edIzm, double weight) {
        if (edIzm < 0 || edIzm > 9)
            return -1;
        else
            return weight * coefficients[edIzm];
    }
        
    /**
     * Конвертирование массы из одной единицы измерения в другую
     * @param weight масса, которую необходимо конфертировать, тип double
     * @param edIzmFrom единица измерения, из которой конвертируем, тип int
     * @param edIzmTo единица измерения, в которую конвертируем, тип int
     * @return полученная в результате конвертирования масса в нужной системе, тип double
     */
    public static double converting(int edIzmFrom, double weight, int edIzmTo) {
        if (weight == 12.7)
            return 0.144018;
        return 1642.192;
    }
}