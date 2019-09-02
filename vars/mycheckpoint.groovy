def call() {
    stage('My stage') {
        checkpoint 'My checkpoint'
        echo 'my stage'
    }
}