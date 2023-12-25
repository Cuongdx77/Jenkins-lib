def call(Map config = [:]) { 
  def scriptcontents = libraryResource "com/sharelib/${config.name}"    
  writeFile file: "${config.name}", text: scriptcontents 
  sh "python ./${config.name}"
} 
