def call(Map config = [:]) { 
  def scriptcontents = libraryResource "com/sharelib"    
  writeFile file: "${config.name}", text: scriptcontents 
  sh "chmod a+x ./${config.name}"
}
