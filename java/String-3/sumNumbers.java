public int sumNumbers(String str) {
  
  str = str.replaceAll("[^\\d]", " ").trim();
  int result=0;
  
  List<String> ls = Arrays.asList(str.split(" "));
  for(String s:ls){
    
    if(!s.trim().equals("")){
      result+=Integer.parseInt(s);
    }
    
  }
  
  
  return result;
}
