const HtmlWebpackPlugin = require('html-webpack-plugin');
const CopyWebpackPlugin = require('copy-webpack-plugin');

module.exports = {
  entry: './src/index.js', // Головний JS-файл
  output: {
    filename: 'app.js', // Файл, який згенерує Webpack
    path: __dirname + '/dist', // Папка для вихідних файлів
  },
  plugins: [
    new HtmlWebpackPlugin({
      template: './src/index.html', // Бере оригінальний HTML
      filename: 'index.html', // І зберігає його в dist
    }),
    new CopyWebpackPlugin({
      patterns: [
        { from: './src/style.css', to: 'css/style.css' }, // Копіює стилі у dist/css
      ],
    }),
  ],
};
