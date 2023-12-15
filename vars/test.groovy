script{
    def yourScriptAsaString = libraryResource '../resources/test.py' 
    writeFile file: 'test.py', text: yourScriptAsaString
    sh "python test.py"
}
