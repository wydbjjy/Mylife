mkdir vuepress-starter && cd vuepress-starter
yarn init # npm init
yarn add -D vuepress # npm install -D vuepress
mkdir docs && echo '# Hello VuePress' > docs/README.md
{
  "scripts": {
    "docs:dev": "vuepress dev docs",
    "docs:build": "vuepress build docs"
  }
}
yarn docs:dev # npm run docs:dev
.
├─ docs
│  ├─ README.md
│  └─ .vuepress
│     └─ config.js
└─ package.json
module.exports = {
  title: 'TypeScript4 文档',
  description: 'TypeScript4 最新官方文档翻译'
}
module.exports = {
    title: '...',
    description: '...',
    themeConfig: {
        nav: [
            { text: '首页', link: '/' },
            { 
                text: '冴羽的 JavaScript 博客', 
                items: [
                    { text: 'Github', link: 'https://github.com/mqyqingfeng' },
                    { text: '掘金', link: 'https://juejin.cn/user/712139234359182/posts' }
                ]
            }
        ]
    }
}
