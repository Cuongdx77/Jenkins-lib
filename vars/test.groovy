  def runMyPython() {
    final pythonContent = libraryResource('../resources/my_file.py')
    writeFile(file: 'test.py', text: pythonContent)
    sh('python ./test.py')
  }
