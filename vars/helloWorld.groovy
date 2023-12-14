  def runMyPython() {
    final pythonContent = libraryResource('test.py')
    writeFile(file: 'test.py', text: pythonContent)
    sh('python ./test.py')
  }
