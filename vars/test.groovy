  def call(Map config = [:]) {
    def pythonContent = libraryResource "com/sharedlib/test.py'"
    writeFile file: "my_file.py", text: pythonContent
    sh "python ./my_file.py"
  }
