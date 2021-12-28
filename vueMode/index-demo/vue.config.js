module.exports = {
    // 选项...
    devServer: {

        // open: process.platform === 'darwin',
        // host: '0.0.0.0',
        port: 80,
        proxy: {  //配置跨域
            before(app){
                console.log(app);
            },
            '/api': {

                target: 'http://localhost:8080/',  //这里后台的地址模拟的;应该填写你们真实的后台接口
                changOrigin: true,  //允许跨域
                pathRewrite: {
                    /* 重写路径，当我们在浏览器中看到请求的地址为：http://localhost:8080/api/core/getData/userInfo 时
                      实际上访问的地址是：http://121.121.67.254:8185/core/getData/userInfo,因为重写了 /api
                     */
                    '^/api': ''
                }
            },
        }
        // https: false,
        // hotOnly: false,
        // proxy: null, // string | Object
        // before: app => {}

    }
}