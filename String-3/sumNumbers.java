/*
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)


sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
*/

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
