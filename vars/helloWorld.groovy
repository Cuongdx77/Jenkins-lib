  def runMyPython() {
    final pythonContent = libraryResource('resources/test.py')
    writeFile(file: 'test.py', text: pythonContent)
    sh('python ./test.py')
  }
