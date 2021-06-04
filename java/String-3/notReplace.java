public String notReplace(String str) {

  // We are replacing all strings which are is with is not.
  return str.replaceAll("(?<![a-zA-Z])(is)(?![a-zA-Z])","is not");
}
