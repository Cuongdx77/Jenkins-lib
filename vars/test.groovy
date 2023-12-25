  def call(Map config = [:]) {
    def scriptContent = libraryResource "com/sharedlib/${config.name}'"
    writeFile file: "${config.name}", text: scriptContent
    sh "chmod a+x ./${config.name}"
  }
