class EnumDemo{
    public enum Names{January,February,March,April,May,June,July,August,September,October,November,December}
    public static void main(String[] args)
    {
        for(Names name:Names.values())
        {
            System.out.println(name+" placed at Index "+name.ordinal());
        }
        
    }
}